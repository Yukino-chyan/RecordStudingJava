//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Book test = new Book("Yukinochyan","Book");
        Book test2 = new Book("Setsuna","Book2");
        System.out.println(test.equal(test2));
        System.out.println(test.getTitle());
        test.borrow("Yukinochyan");
        System.out.println(test.getNumbers());
    }
}