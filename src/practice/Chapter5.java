package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {


		List<Task> list = new ArrayList<>();

		list.add(new Task(LocalDate.of (2021, 10, 21),"�����𔃂�"));
		list.add(new Task(LocalDate.of (2021, 9, 15),"�����Жʐ�"));
		list.add(new Task(LocalDate.of (2021, 12, 4),"�蒠�𔃂�"));
		list.add(new Task(LocalDate.of (2021, 8, 10),"�U���ɍs��"));
		list.add(new Task(LocalDate.of (2021, 11, 9),"�X�N�[���̉ۑ������"));

        Collections.sort(list);

		for (Task task : list) {
		      System.out.println(task.getDate() + ":" + task.getTask());

		    }
		  }

		}






