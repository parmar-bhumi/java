import java.io.*;
class File_info
{
	public static void main(String[] args) throws IOException
	{
			File f=new File("D:\\java\\unit-4\\mca.txt");

			System.out.println("File name:"+f.getName());

			System.out.println("File path:"+f.getAbsolutePath());

			System.out.println("Read:"+f.canRead());

			System.out.println("Write:"+f.canWrite());

			System.out.println("File length:"+f.length());

			//System.out.println("File remove:"+f.delete());
	}
}