package builder.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;                             //文件名
    private PrintWriter writer;                          //用于编写文件的PrintWriter

    @Override
    public void makeTile(String title) {
        count++;//html文件的标题
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        //输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {     //html文件中的字符串
        writer.println("<p>" + str + "</p>"); //用<p>标签输出
    }

    @Override
    public void makeItem(String[] items) {    //用html文件中的条目
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {                         //完成文档
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {                      //编写完成的文档
        return filename;                            //返回文件名
    }
}
