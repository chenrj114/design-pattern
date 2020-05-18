package chapter11_Facade_Pattern.demo2;

/**
 * @ClassName EncryptFacade
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:57
 * @Version 1.0
 */

public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade()
    {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void FileEncrypt(String fileNameSrc, String fileNameDes)
    {
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.Encrypt(plainStr);
        writer.Write(encryptStr, fileNameDes);
    }
}
