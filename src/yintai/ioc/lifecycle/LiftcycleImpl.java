package yintai.ioc.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public class LiftcycleImpl extends DefaultLifecycleProcessor {

//    @Override
//    public void start() {
//        System.out.println("call start()  [interface : lifecycle] ");
//        super.start();
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("call stop()  [interface : lifecycle] ");
//        super.start();
//    }



    @Override
    public void onClose() {
        System.out.println("call Liftcycle.onClose()   ");
        super.onClose();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
