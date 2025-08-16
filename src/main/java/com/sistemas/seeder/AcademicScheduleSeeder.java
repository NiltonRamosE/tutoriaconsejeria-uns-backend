package com.sistemas.seeder;

import com.sistemas.domain.AcademicSchedule;
import com.sistemas.service.AcademicScheduleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class AcademicScheduleSeeder {
    CommandLineRunner initAcademicScheduleTable(AcademicScheduleService academicScheduleService) {
        return args -> {
            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CALCULO INTEGRAL")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CALCULO INTEGRAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CALCULO INTEGRAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(9, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CALCULO INTEGRAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(17, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("FISICA I")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("FISICA I")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("FISICA I")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("FISICA I")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("QUIMICA GENERAL")
                    .academicScheduleTypeCode("TEO")
                    .day("MARTES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("QUIMICA GENERAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("QUIMICA GENERAL")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(18, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("QUIMICA GENERAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("QUIMICA GENERAL")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CREATIVIDAD E INNOVACION")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CREATIVIDAD E INNOVACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("CREATIVIDAD E INNOVACION")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TECNOLOGIAS DE INFORMACION Y COMUNICACION")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TECNOLOGIAS DE INFORMACION Y COMUNICACION")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TECNOLOGIAS DE INFORMACION Y COMUNICACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TECNOLOGIAS DE INFORMACION Y COMUNICACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TECNOLOGIAS DE INFORMACION Y COMUNICACION")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTRODUCCION A LA INVESTIGACION CIENTIFICA")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTRODUCCION A LA INVESTIGACION CIENTIFICA")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTRODUCCION A LA INVESTIGACION CIENTIFICA")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTRODUCCION A LA INVESTIGACION CIENTIFICA")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PROGRAMACION")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PROGRAMACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PROGRAMACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PROGRAMACION")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE COMPUTADORAS")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE COMPUTADORAS")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE COMPUTADORAS")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE COMPUTADORAS")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE COMPUTADORAS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("DINAMICA DE SISTEMAS II")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("DINAMICA DE SISTEMAS II")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("DINAMICA DE SISTEMAS II")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ESTRUCTURA DE DATOS")
                    .academicScheduleTypeCode("TEO")
                    .day("MARTES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ESTRUCTURA DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ESTRUCTURA DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(9, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ESTRUCTURA DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE REQUISITOS")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE REQUISITOS")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE REQUISITOS")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE REQUISITOS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(9, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INVESTIGACION DE OPERACIONES I")
                    .academicScheduleTypeCode("TEO")
                    .day("MARTES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INVESTIGACION DE OPERACIONES I")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES DISTRIBUIDAS I")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES DISTRIBUIDAS I")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(9, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES DISTRIBUIDAS I")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("COMUNICACION DE DATOS")
                    .academicScheduleTypeCode("TEO")
                    .day("MARTES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("COMUNICACION DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("COMUNICACION DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("BASE DE DATOS II")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("BASE DE DATOS II")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("BASE DE DATOS II")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE SOFTWARE EMPRESARIAL")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE SOFTWARE EMPRESARIAL")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA DE SOFTWARE EMPRESARIAL")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(17, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SISTEMAS DE INFORMACION II")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SISTEMAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SISTEMAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(18, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SISTEMAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SISTEMAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE PROCESOS DE NEGOCIO")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE PROCESOS DE NEGOCIO")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE PROCESOS DE NEGOCIO")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE PROCESOS DE NEGOCIO")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE PROCESOS DE NEGOCIO")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA ORIENTADA A SERVICIOS Y MICROSERVICIOS")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA ORIENTADA A SERVICIOS Y MICROSERVICIOS")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ARQUITECTURA ORIENTADA A SERVICIOS Y MICROSERVICIOS")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("REDES DE COMPUTADORAS II")
                    .academicScheduleTypeCode("TEO")
                    .day("JUEVES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("REDES DE COMPUTADORAS II")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("REDES DE COMPUTADORAS II")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTELIGENCIA ARTIFICIAL")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INTELIGENCIA ARTIFICIAL")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE TECNOLOGIAS DE INFORMACION II")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE TECNOLOGIAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE TECNOLOGIAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE TECNOLOGIAS DE INFORMACION II")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(17, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE SOFTWARE II")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE SOFTWARE II")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("INGENIERIA DE SOFTWARE II")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(17, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AGENTES INTELIGENTES")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AGENTES INTELIGENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AGENTES INTELIGENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AGENTES INTELIGENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AGENTES INTELIGENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE LAS RELACIONES CON LOS CLIENTES")
                    .academicScheduleTypeCode("TEO")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE LAS RELACIONES CON LOS CLIENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE LAS RELACIONES CON LOS CLIENTES")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PSICOLOGIA ORGANIZACIONAL")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PSICOLOGIA ORGANIZACIONAL")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(10, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("PSICOLOGIA ORGANIZACIONAL")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES MOVILES")
                    .academicScheduleTypeCode("TEO")
                    .day("JUEVES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES MOVILES")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SEGURIDAD INFORMATICA")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SEGURIDAD INFORMATICA")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("SEGURIDAD INFORMATICA")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ROBOTICA")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ROBOTICA")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ROBOTICA")
                    .academicScheduleTypeCode("LAB")
                    .day("MARTES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ROBOTICA")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DEL GOBIERNO DE T.I.")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DEL GOBIERNO DE T.I.")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DEL GOBIERNO DE T.I.")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ALGORITMOS EVOLUTIVOS Y DE APRENDIZAJE")
                    .academicScheduleTypeCode("TEO")
                    .day("JUEVES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ALGORITMOS EVOLUTIVOS Y DE APRENDIZAJE")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ALGORITMOS EVOLUTIVOS Y DE APRENDIZAJE")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ALGORITMOS EVOLUTIVOS Y DE APRENDIZAJE")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(18, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("NEGOCIOS DIGITALES")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("NEGOCIOS DIGITALES")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(9, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("NEGOCIOS DIGITALES")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("EMPODERAMIENTO Y LIDERAZGO")
                    .academicScheduleTypeCode("TEO")
                    .day("MARTES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("EMPODERAMIENTO Y LIDERAZGO")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(11, 0))
                    .endTime(LocalTime.of(13, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("EMPODERAMIENTO Y LIDERAZGO")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(18, 0))
                    .endTime(LocalTime.of(20, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS I")
                    .academicScheduleTypeCode("TEO")
                    .day("SABADO")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS I")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS I")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES EN LA NUBE")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES EN LA NUBE")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("APLICACIONES EN LA NUBE")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(17, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE CENTROS DE DATOS")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE CENTROS DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(15, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE CENTROS DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(14, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("ADMINISTRACION DE CENTROS DE DATOS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(11, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("MODELO DE SISTEMA VIABLE")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("MODELO DE SISTEMA VIABLE")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("MODELO DE SISTEMA VIABLE")
                    .academicScheduleTypeCode("LAB")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(16, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("MODELO DE SISTEMA VIABLE")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AUDITORIA DE SISTEMAS")
                    .academicScheduleTypeCode("TEO")
                    .day("LUNES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AUDITORIA DE SISTEMAS")
                    .academicScheduleTypeCode("LAB")
                    .day("SABADO")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AUDITORIA DE SISTEMAS")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(17, 0))
                    .endTime(LocalTime.of(19, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("AUDITORIA DE SISTEMAS")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(12, 0))
                    .endTime(LocalTime.of(14, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE LA ARQUITECTURA EMPRESARIAL")
                    .academicScheduleTypeCode("TEO")
                    .day("JUEVES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("GESTION DE LA ARQUITECTURA EMPRESARIAL")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(8, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS II")
                    .academicScheduleTypeCode("TEO")
                    .day("MIERCOLES")
                    .startTime(LocalTime.of(7, 0))
                    .endTime(LocalTime.of(9, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS II")
                    .academicScheduleTypeCode("LAB")
                    .day("VIERNES")
                    .startTime(LocalTime.of(16, 0))
                    .endTime(LocalTime.of(18, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS II")
                    .academicScheduleTypeCode("LAB")
                    .day("LUNES")
                    .startTime(LocalTime.of(10, 0))
                    .endTime(LocalTime.of(12, 0))
                    .build());

            academicScheduleService.create(AcademicSchedule.builder()
                    .course("TESIS II")
                    .academicScheduleTypeCode("LAB")
                    .day("JUEVES")
                    .startTime(LocalTime.of(13, 0))
                    .endTime(LocalTime.of(15, 0))
                    .build());

        };
    }
}
