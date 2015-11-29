package br.com.observer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReminderTask {

	public void reminder(Runnable runnable, long INITIAL_DELAY, long PERIOD,
			TimeUnit timeUnit) {
		ScheduledExecutorService service = Executors
				.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(runnable, INITIAL_DELAY, PERIOD, timeUnit);
	}
	
	public void reminder(Runnable runnable, long INITIAL_DELAY, long PERIOD){
		final Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				new Thread(runnable).start();
				/**
				 * After cancel task
				 */
				t.cancel();
			}
		}, INITIAL_DELAY, PERIOD);
	}
}
