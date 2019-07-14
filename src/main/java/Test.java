import dagger.ObjectComponent;
import dagger.ObjectProvider;
import jenison.JenisonTask;
import leo.LeoTask;
import dagger.DaggerObjectComponent;

public class Test {

    public static void main(String[] ar){
        ObjectComponent component=DaggerObjectComponent.builder().objectProvider(new ObjectProvider()).build();
        if(component!=null){
            System.out.println("success");
        }
        JenisonTask jenisonTask=new JenisonTask(component);
        LeoTask leoTask=new LeoTask(component);
    }
}
