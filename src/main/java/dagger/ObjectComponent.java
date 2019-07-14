package dagger;

import jenison.JenisonTask;
import leo.LeoTask;

import java.util.concurrent.ExecutorService;

@Component(modules = {ObjectProvider.class})
public interface ObjectComponent {
    public ExecutorService willReturnExeSeve();

    void inject(JenisonTask jenisonTask);

    void inject(LeoTask leoTask);
}
