package dagger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Module
public class ObjectProvider {

    @Provides
    public ExecutorService provideExecutorService(){
        return  Executors.newFixedThreadPool(2);
    }
}
