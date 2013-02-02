import java.net.*;
import java.io.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Server
{
	public static void main(String[] args) 
		throws IOException
	{
		//����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(30000);
		//����ѭ�����Ͻ������Կͻ��˵�����
		while (true)
		{
			//ÿ�����ܵ��ͻ���Socket�����󣬷�������Ҳ��Ӧ����һ��Socket
			Socket s = ss.accept();
			//��Socket��Ӧ���������װ��PrintStream
			PrintStream ps = new PrintStream(s.getOutputStream());
			//������ͨIO����
			ps.println("���ã����յ��˷�����������ף����");
			//�ر���������ر�Socket
			ps.close();
			s.close();
		}
	}
}