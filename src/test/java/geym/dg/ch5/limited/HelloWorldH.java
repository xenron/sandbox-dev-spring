package geym.dg.ch5.limited;

public class HelloWorldH {
  private String name;
  private HelloWorld hw;


  public HelloWorld getHw() {
    return hw;
  }

  public void setHw(HelloWorld hw) {
    this.hw = hw;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printHello() {
    System.out.println("Hello ! From HelloWorldH" + name);
  }
}