public class Client
{
    public static void main(String[] args)
    {
        Persistence fp=new FilePersistence();
        fp.persist();
        Persistence dp=new DatabasePersistence();
        dp.persist();
    }
}