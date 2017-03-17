package org.zsy.basics;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by admin on 2017/3/17.
 */
public class ColPipeline implements Pipeline {

    @Override
    public void process(ResultItems resultItems, Task task) {
        Iterator iterator = resultItems.getAll().entrySet().iterator();

        while(iterator.hasNext()) {

            Map.Entry entry = (Map.Entry)iterator.next();
            if(entry.getValue() instanceof CrawDate) {
                System.out.println((String) entry.getKey() + ":\t" + entry.getValue());
            }
        }
        CrawDate craw = (CrawDate)resultItems.get("craw");
        System.out.println(craw.toString());
    }


}
