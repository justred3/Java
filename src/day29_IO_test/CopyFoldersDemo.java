package day29_IO_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��ƶ༫�ļ���
 * 
 * ����Դ��E:\JavaSE\day21\code\demos
 * Ŀ�ĵأ�E:\\
 * 
 * ������
 * 		A:��װ����ԴFile
 * 		B:��װĿ�ĵ�File
 * 		C:�жϸ�File���ļ��л����ļ�
 * 			a:���ļ���
 * 				����Ŀ�ĵ�Ŀ¼�´������ļ���
 * 				��ȡ��File�����µ������ļ������ļ���File����
 * 				�����õ�ÿһ��File����
 * 				�ص�C
 * 			b:���ļ�
 * 				�͸���(�ֽ���)
 */
public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����ԴFile
		File srcFile = new File("E:\\JavaSE\\day21\\code\\demos");
		// ��װĿ�ĵ�File
		File destFile = new File("E:\\");

		// �����ļ��еĹ���
		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile)
			throws IOException {
		// �жϸ�File���ļ��л����ļ�
		if (srcFile.isDirectory()) {
			// �ļ���
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			// ��ȡ��File�����µ������ļ������ļ���File����
			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);
			}
		} else {
			// �ļ�
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	private static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}

/*public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		File scrFolder = new File("E:\\java\\java\\day21\\code\\day21_IO_test\\src\\cn");
		File destFolder = new File("E:\\demo");	
		bianli(scrFolder,destFolder);
	}

	public static void bianli(File scrFolder, File destFolder) throws IOException {
		File[] arr = scrFolder.listFiles();
		for (File x : arr) {
			if(x.isDirectory()){
				File h =new File(destFolder,x.getName());
				h.mkdir();
				CopyFoldersDemo.bianli(x, h);
			}else{
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(x));
				File s = new File(destFolder,x.getName());
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(s));
				int len = 0;
				byte by[] =new byte[1024];
				while((len=bis.read(by))!=-1){
					bos.write(by, 0, len);
					bos.flush();
				}
				bos.close();
				bis.close();
			}
		}
	}
}*/
