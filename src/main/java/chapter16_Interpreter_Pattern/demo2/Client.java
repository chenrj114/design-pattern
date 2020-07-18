package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:23
 * @Version 1.0
 */

public class Client {

    public static void main(String args[]) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
