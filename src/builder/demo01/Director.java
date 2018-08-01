package builder.demo01;

public class Director {

    private Builder builder;

    public Director(Builder builder) {   //因为接收的参数是Builder类的子类
        this.builder = builder;         //所以可以将其保存在builder字段中
    }

    public void construct(){                //编写文档

        builder.makeTile("Greeting");      //标题

        if(builder.count>=1){
            System.out.println("必须首先至少调用一次makeTitle");
            return;
        }
        builder.makeString("从早上至下午"); //字符串
        builder.makeItem(new String[]{       //条目
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");       //其他字符串
        builder.makeItem(new String[]{     //其他条目
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();                   //完成文档
    }
}
