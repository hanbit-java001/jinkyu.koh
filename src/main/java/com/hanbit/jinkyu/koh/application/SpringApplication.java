package com.hanbit.jinkyu.koh.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.hanbit.jinkyu.koh.core.dao.MybatisExampleDAO;

public class SpringApplication {

	public static void main(String[] args) {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");

			ApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("spring/applicationContext-core.xml",
							"spring/applicationContext-dao.xml");

			/*SchedulerService schedulerService = applicationContext.getBean(SchedulerService.class);

			ScheduleVO schedule = new ScheduleVO();
			schedule.setScheduleId(String.valueOf(System.currentTimeMillis()));
			schedule.setTitle("저녁");
			schedule.setMemo("반찬 뭘까");
			schedule.setStartDt("201609131830");
			schedule.setEndDt("201609131930");

			int result = schedulerService.addSchedule(schedule);*/

			MybatisExampleDAO mybatisExampleDAO = applicationContext.getBean(MybatisExampleDAO.class);

			mybatisExampleDAO.logSystdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
