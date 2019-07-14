package jenison;

import dagger.ObjectComponent;

import javax.inject.Inject;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JenisonTask {

    @Inject
    public ExecutorService executors;

    public JenisonTask(ObjectComponent component){
        component.inject(this);
        executors.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
