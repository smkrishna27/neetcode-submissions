class Solution {
    public int[] findRedundantConnection(int[][] edges) {
     int n = edges.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            boolean[] visited = new boolean[n + 1];
            if (dfs(graph, visited, u, v)) {
                return edge;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[0];

    }

    private static boolean dfs(List<List<Integer>> graph, boolean[] visited, int i, int j) {
        if (i == j) return true;
        visited[i] = true;
        for (int node : graph.get(i)) {
            if (!visited[node]) {
                if (dfs(graph, visited, node, j)) {
                    return true;
                }
            }
        }
        return false;


    }
}
