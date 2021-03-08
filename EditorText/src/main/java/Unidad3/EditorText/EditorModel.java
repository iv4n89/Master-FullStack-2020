package Unidad3.EditorText;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EditorModel {
	
	public void save(TextFile textFile) {
		try {
			Files.write(textFile.getFile(), textFile.getContent(),StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public IOResult<TextFile> load(Path file) {
		try {
			List<String> lines=Files.readAllLines(file);
			return new IOResult<TextFile>(true, new TextFile(file, lines));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new IOResult<TextFile>(false, null);
		}
	}
	
	public void close() {
		System.exit(0);
	}

}
