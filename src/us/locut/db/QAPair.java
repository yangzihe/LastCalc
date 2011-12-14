package us.locut.db;

import java.io.*;
import java.util.ArrayList;

import com.googlecode.objectify.annotation.Unindexed;

public class QAPair implements Serializable {
	private static final long serialVersionUID = 8234981855606438804L;

	public QAPair(final String question, final ArrayList<Object> answer)
			throws IOException {
		this.question = question;
		this.answer = answer;
	}

	public String varAssignment;

	public String question;

	@Unindexed
	public ArrayList<Object> answer;
}