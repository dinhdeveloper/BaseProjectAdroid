/*
 * (c) Copyright GoTechCom 2016
 */

package baseproject.tran.canhdinh.helper;

import org.greenrobot.eventbus.EventBus;

public class BusHelper
{
    private BusHelper()
    {
    }

    public static void register(Object subscriber)
    {
        if (!EventBus.getDefault().isRegistered(subscriber))
        {
            try
            {
                EventBus.getDefault().register(subscriber);
            }
            catch (Exception e)
            {
                // ignore
            }
        }
    }

    public static void unregister(Object subscriber)
    {
        if (EventBus.getDefault().isRegistered(subscriber))
        {
            try
            {
                EventBus.getDefault().unregister(subscriber);
            }
            catch (Exception e)
            {
                // ignore
            }
        }
    }

    public static void post(Object event)
    {
        EventBus.getDefault().post(event);
    }
}
