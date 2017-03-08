package heap_and_prioritysort.practice;
 
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
 
class FasterScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
 
	public FasterScanner() {
		this(System.in);
	}
 
	public FasterScanner(InputStream is) {
		mIs = is;
	}
 
	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = mIs.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
 
	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}
 
	public String nextString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}
 
	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
 
	public boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}
 
}
class Topics {
	long id;
	long oz;
	long nz;
 
	public long getDiff() {
		return nz - oz;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s", id, nz);
	}
}
 
class RHeap {
	ArrayList<Topics> heap;
 
	public RHeap() {
		heap = new ArrayList<>();
	}
 
	public void siftUp() {
		int k = heap.size() - 1;
		int p;
		if (heap.size() < 5) {
			p = k - 1;
 
		} else {
			p = 4;
		}
 
		while (k > 0) {
			
			Topics child = heap.get(k);
			Topics parent = heap.get(p);
 
			if (heap.get(k).getDiff() > heap.get(p).getDiff()) {
				// child is greter than parent, swap
				heap.set(k, parent);
				heap.set(p, child);
				k = p;
				p = p - 1;
			} else if(heap.get(k).getDiff() == heap.get(p).getDiff() && heap.get(k).id > heap.get(p).id) {
				heap.set(k, parent);
				heap.set(p, child);
				k=p;
				p=p-1;
			}else {
				break;
			}
 
		}
	}
 
	public void add(Topics item) {
		heap.add(item);
		siftUp();
 
	}
}
 
class TestClass {
	public static void main(String args[]) throws Exception {
		
		FasterScanner s = new FasterScanner(System.in);
		PrintWriter mOut = new PrintWriter(System.out);
 
		int num = s.nextInt();
		RHeap mHeap = new RHeap();
		for (int i = 0; i < num; i++) {
			Topics topic = new Topics();
			topic.id = s.nextLong();
			topic.oz = s.nextLong();
			long p = (long)50*s.nextLong();
			long l = (long)5*s.nextLong();
			long c = (long)10*s.nextLong();
			long sh = (long)20*s.nextLong();
			
			topic.nz = p + l + c + sh;
			
			
			mHeap.add(topic);
			
		}
		
		for(int i =0;i<5;i++) {
			mOut.println(mHeap.heap.get(i).id + " " +mHeap.heap.get(i).nz);
		}
 
		mOut.flush();
 
	}
}