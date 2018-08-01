package adapter.a;

import adapter.a.Banner;
import adapter.a.Print;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
    super.showWithParen();
    }

    @Override
    public void printStrong() {
    super.showWithAster();
    }
}
