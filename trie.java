import java.util.List;

public interface trie{

    // basic functionality
    public void insert(String word);
    public void delete(String word);
    public void inTree(String word);
    public void isPrefix(String word);
    public int numWords();
    
    // fun searching
    public List<String> getWordsThatStartWith(String prefix);
    

    //FileIO  #### THese should throw the appropriate fileIO exceptions
    //        ### will add that later
    public void insertFromFile(String filename);    
    public void writeToFile(String Filename);
}