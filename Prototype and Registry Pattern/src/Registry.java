import java.util.HashMap;

public class Registry {

    private HashMap <String, Object> map = new HashMap<>();

    public void set(String key, Object obj)
    {
        map.put(key, obj);
    }
    public Student  get(String key)
    {
        return (Student) map.get(key);
    }
}

