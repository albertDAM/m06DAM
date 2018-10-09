
import java.io.File;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class Partits {


	public static void main(String[] args) {

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}
		
		JFileChooser jfc1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc1.setDialogTitle("Multiple file and directory selection:");
		jfc1.setMultiSelectionEnabled(true);
		jfc1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		int returnValue1 = jfc1.showOpenDialog(null);
		if (returnValue1 == JFileChooser.APPROVE_OPTION) {
			File[] files = jfc1.getSelectedFiles();
			System.out.println("Directories found\n");
			Arrays.asList(files).forEach(x -> {
				if (x.isDirectory()) {
					System.out.println(x.getName());
				}
			});
			System.out.println("\n- - - - - - - - - - -\n");
			System.out.println("Files Found\n");
			Arrays.asList(files).forEach(x -> {
				if (x.isFile()) {
					System.out.println(x.getName());
				}
			});
		}

	}

}


