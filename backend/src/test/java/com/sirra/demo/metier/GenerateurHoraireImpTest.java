package com.sirra.demo.metier;

import com.sirra.demo.model.Departement;
import com.sirra.demo.model.HoraireOuvertureSemaine;
import com.sirra.demo.ressources.FakeDepartement;
import com.sirra.demo.ressources.MockDepartement;
import com.sirra.demo.ressources.MokcHorairesOuverture;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GenerateurHoraireImpTest {

    @Test
    void getFirstDayOfWeekMilieu() {
        ZonedDateTime heureExpected = ZonedDateTime.of(2019, 12, 9, 0,
                0, 0, 0, ZoneId.of("UTC-5"));

        ZonedDateTime heureTest = ZonedDateTime.of(2019, 12, 12, 0,
                45, 59, 1234, ZoneId.of("UTC-5"));
        assertEquals(heureExpected, GenerateurHoraireImp.getFirstDayOfWeek(heureTest));
    }

    @Test
    void getFirstDayOfWeekDebut() {
        ZonedDateTime heureExpected = ZonedDateTime.of(2019, 12, 9, 0,
                0, 0, 0, ZoneId.of("UTC-5"));

        ZonedDateTime heureTest = ZonedDateTime.of(2019, 12, 9, 0,
                45, 59, 1234, ZoneId.of("UTC-5"));
        assertEquals(heureExpected, GenerateurHoraireImp.getFirstDayOfWeek(heureTest));
    }

    @Test
    void getFirstDayOfWeekFin() {
        ZonedDateTime heureExpected = ZonedDateTime.of(2019, 12, 9, 0,
                0, 0, 0, ZoneId.of("UTC-5"));

        ZonedDateTime heureTest = ZonedDateTime.of(2019, 12, 14, 0,
                45, 59, 1234, ZoneId.of("UTC-5"));
        assertEquals(heureExpected, GenerateurHoraireImp.getFirstDayOfWeek(heureTest));
    }

    @Test
    void getFirstDayOfWeekAvant() {
        ZonedDateTime heureExpected = ZonedDateTime.of(2019, 12, 2, 0,
                0, 0, 0, ZoneId.of("UTC-5"));

        ZonedDateTime heureTest = ZonedDateTime.of(2019, 12, 8, 0,
                45, 59, 1234, ZoneId.of("UTC-5"));
        assertEquals(heureExpected, GenerateurHoraireImp.getFirstDayOfWeek(heureTest));
    }

    @Test
    void genererHoraireSemaineDep() {
        ZonedDateTime dateDebut = ZonedDateTime.parse("2019-12-02T00:00-05:00[UTC-05:00]");
        FakeDepartement fakeDep = new FakeDepartement();
        HoraireOuvertureSemaine horaireExpected = MokcHorairesOuverture.getHoraire1();
        assertEquals(horaireExpected, GenerateurHoraireImp.genererHoraireSemaineDep(dateDebut, fakeDep));
    }

    @Test
    void genererHoraireSemaineToutOuvert() {
        ZonedDateTime dateDebut = ZonedDateTime.parse("2019-12-02T00:00-05:00[UTC-05:00]");
        Departement fakeDep = MockDepartement.getDepartementOuvert();
        HoraireOuvertureSemaine horaireExpected = MokcHorairesOuverture.getHoraireComplet();
        HoraireOuvertureSemaine horaireResultat = GenerateurHoraireImp.genererHoraireSemaineDep(dateDebut, fakeDep);
        assertEquals(horaireExpected, horaireResultat);
    }
}