package builder.demo02;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();//文档被保存到该字段中

    @Override
    public void makeTile(String title) {     //纯文本的标题

        buffer.append("=================================");//装饰线
        buffer.append("["+title+"]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("#"+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] items) {     //纯文本的条目
        for (int i = 0; i <items.length ; i++) {
            buffer.append("  ."+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===================================");
    }
    public String getResult(){                //完成的文档
        return buffer.toString();
    }

}
