package tool;

import net.sf.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class Tool {
    public static Map<String,Object> testLayui(Object object,int page,int limit){
        Map<String,Object> returnTable = new HashMap<>();
        returnTable.put("code",0);    //自己设定的code值一定要写0，其他的值都是错误的
        returnTable.put("msg","");    //msg的值一定要写"",不然会一直报错
        returnTable.put("count",1000);
        JSONArray data = JSONArray.fromObject(object);
        returnTable.put("data",data);
        return returnTable;
    }
}
