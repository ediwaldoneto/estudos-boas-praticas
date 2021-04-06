package br.com.nt.datatime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

public class DataTime {

	private static final Logger LOGGER = Logger.getLogger(DataTime.class);

	public static void main(String[] args) {

		LOGGER.info("INICIO :: DataTime");

		// Uso do ZoneDateTime

		ZoneId fusoHorarioPE = ZoneId.of("America/Recife");
		ZonedDateTime agoraPE = ZonedDateTime.now(fusoHorarioPE);

		LOGGER.info(agoraPE);
		//2021-04-06T11:47:03.646550200-03:00[America/Recife]

	}

}
