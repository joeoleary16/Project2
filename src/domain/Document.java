package domain;

import java.io.File;

public class Document {
	private File file;
	
	Document(File document) {
		file = document;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Document [file=" + file + "]";
	}
}
