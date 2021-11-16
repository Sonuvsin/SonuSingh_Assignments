public class singletone {
    private static singletone single=new singletone();

    private singletone()
    {

    }

    public static singletone getInstance()
    {
        return single;
    }
    public void getInfo()
    {
        System.out.println("In singletone class");
    }

}


