package Week1;
// Quick-find - one connected componenet is represented by one id
// intialise - intialise an array 
//           - set the value of each element to be the index of the array
// union - change all the entries where id[i] = id[p] to id[q]
// connected - id id[p] = id[q]
// data is stored in an array

public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int n) {
        id = new int[n];
        for (int i : id){
            id[i] = i;
        }
    }
    
    void union(int p, int q) {
        if(connected(p, q)) {
            return;
        }
        int pid = id[p];
        int qid = id[q];
        for(int i : id){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }
    boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }
}

