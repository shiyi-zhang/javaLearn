package org.zsy.basics;

import java.io.Reader;
import org.apache.ibatis.io.Resources;

/**
 * @author 张世一
 * @version 1.0
 */
public class ReadJson {

    public static void main(String[] args)throws Exception {
        Reader reader = Resources.getResourceAsReader("chinaGeo.json");
    }

}
