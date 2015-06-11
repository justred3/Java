package day29_IO_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制多极文件夹
 * 
 * 数据源：E:\JavaSE\day21\code\demos
 * 目的地：E:\\
 * 
 * 分析：
 * 		A:封装数据源File
 * 		B:封装目的地File
 * 		C:判断该File是文件夹还是文件
 * 			a:是文件夹
 * 				就在目的地目录下创建该文件夹
 * 				获取该File对象下的所有文件或者文件夹File对象
 * 				遍历得到每一个File对象
 * 				回到C
 * 			b:是文件
 * 				就复制(字节流)
 */
public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源File
		File srcFile = new File("E:\\JavaSE\\day21\\code\\demos");
		// 封装目的地File
		File destFile = new File("E:\\");

		// 复制文件夹的功能
		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile)
			throws IOException {
		// 判断该File是文件夹还是文件
		if (srcFile.isDirectory()) {
			// 文件夹
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			// 获取该File对象下的所有文件或者文件夹File对象
			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);
			}
		} else {
			// 文件
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
