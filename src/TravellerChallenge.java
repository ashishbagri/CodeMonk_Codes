import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TravellerChallenge {
    public static void main(String[] args) throws IOException {
        new TravellerChallenge().solve();
        String a_b;
        try {
            a_b = "x";
        } catch (Exception e) {

        }
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, List<String>> graph = new HashMap<>();
        Map<String,Boolean> visited = new HashMap<>();
        //construct graph
        while(n-->0){
            String[] in = br.readLine().split(" ");
            if(!graph.containsKey(in[0]))
                graph.put(in[0],new ArrayList<>());
            graph.get(in[0]).add(in[1]);
        }

        String start = br.readLine();

        Queue<String> q = new LinkedList<>();
        q.add(start);
        visited.put(start,true);
        while (!q.isEmpty()){
            String index = q.poll();
            System.out.println(index);
            List<String> children = graph.get(index);
            if(children == null || children.isEmpty())
                continue;;
            for(String child : children){
                if(visited.get(child)!=null && !visited.get(child)){
                    q.add(child);
                    visited.put(child,true);
                }
            }
        }
    }

}
