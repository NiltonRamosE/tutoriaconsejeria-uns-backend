package com.sistemas.seeder;

import com.sistemas.domain.Student;
import com.sistemas.domain.vo.student.*;
import com.sistemas.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StudentSeeder {
    CommandLineRunner initStudentTable(StudentService studentService) {
        return args -> {
            studentService.create(Student.builder()
                    .name("Gabriel Luis")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Hernández")
                    .studentCode("202414001")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 12, 24))
                    .cellphoneNumber("941715295")
                    .password("claveE0001")
                    .socioeconomicInformation(
                        new SocioeconomicInformation(
                            "CHIMBOTE",
                            MaritalStatus.SOLTERO,
                            0,
                            null,
                            null,
                            0,
                            0.0,
                            "951234567",
                            "gabriel15@gmail.com",
                            "AV. PASTO 123",
                            5,
                            "HIJO",
                            HousingType.CASA
                        )
                    )
                    .personalProblems(new PersonalProblems(PersonalProblemType.A, null, "SOFIA HERNÁNDEZ SIFUENTES"))
                    .familyGroupInformation(
                        new FamilyGroupInformation(
                            "SECUNDARIA",
                            "SUPERIOR",
                            "COMERCIANTE",
                            "AMA DE CASA",
                            FamilyComposition.NUCLEAR,
                            2,
                            2,
                            FamilyType.COMPLETA,
                            "951234567"
                        )
                    )
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela María")
                    .paternalSurname("Hernández")
                    .maternalSurname("Hernández")
                    .studentCode("202414002")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 3, 19))
                    .cellphoneNumber("908788317")
                    .password("claveE0002")
                    .socioeconomicInformation(
                        new SocioeconomicInformation(
                            "TRUJILLO",
                            MaritalStatus.CASADO,
                            2,
                            "IESL",
                            "SEÑOR DE LA MISERICORDIA",
                            1,
                            1500.50,
                            "908788317",
                            "maria87@gmail.com",
                            "JR. LIMA 456",
                            3,
                            "CONYUGE",
                            HousingType.DEPARTAMENTO
                        )
                    )
                    .personalProblems(new PersonalProblems(null, "ANSIEDAD", "LUIS RAMÍREZ VASQUEZ"))
                    .familyGroupInformation(
                        new FamilyGroupInformation(
                            "SECUNDARIA",
                            "SUPERIOR",
                            "ABOGADO",
                            "DOCENTE",
                            FamilyComposition.NUCLEAR,
                            3,
                            1,
                            FamilyType.COMPLETA,
                            "954321678"
                        )
                    )
                    .build());

            studentService.create(Student.builder()
                    .name("Luis Victor")
                    .paternalSurname("Vargas")
                    .maternalSurname("Pérez")
                    .studentCode("202414003")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 2, 11))
                    .cellphoneNumber("925189636")
                    .password("claveE0003")
                    .socioeconomicInformation(
                        new SocioeconomicInformation(
                            "LIMA",
                            MaritalStatus.SOLTERO,
                            1,
                            "PROGRAMADOR",
                            "REMOTO",
                            1,
                            900.0,
                            "987654321",
                            "carlos12@gmail.com",
                            "AV. AREQUIPA 789",
                            2,
                            "PADRE",
                            HousingType.CASA
                        )
                    )
                    .personalProblems(new PersonalProblems(null, "DEPRESIÓN", "ANA PÉREZ TORRES"))
                    .familyGroupInformation(
                        new FamilyGroupInformation(
                            "PRIMARIA",
                            "UNIVERSITARIO",
                            "VENDEDOR",
                            "AMA DE CASA",
                            FamilyComposition.EXTENSA,
                            1,
                            1,
                            FamilyType.INCOMPLETA,
                            "987654321"
                        )
                    )
                    .build());

            studentService.create(Student.builder()
                    .name("Alejandro Carlos")
                    .paternalSurname("Martínez")
                    .maternalSurname("Sánchez")
                    .studentCode("202414004")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 10, 9))
                    .cellphoneNumber("910460008")
                    .password("claveE0004")
                    .socioeconomicInformation(
                        new SocioeconomicInformation(
                            "AREQUIPA",
                            MaritalStatus.SOLTERO,
                            0,
                            null,
                            null,
                            0,
                            0.0,
                            "965432198",
                            "alejandro23@gmail.com",
                            "JR. MERCADO 321",
                            1,
                            "HIJO",
                            HousingType.CASA
                        )
                    )
                    .personalProblems(new PersonalProblems(PersonalProblemType.C, null, "JOSÉ MARTÍNEZ GARCÍA"))
                    .familyGroupInformation(
                        new FamilyGroupInformation(
                            "SECUNDARIA",
                            "SECUNDARIA",
                            "COMERCIANTE",
                            "AMA DE CASA",
                            FamilyComposition.NUCLEAR,
                            2,
                            2,
                            FamilyType.COMPLETA,
                            "965432198"
                        )
                    )
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Carlos")
                    .paternalSurname("Hernández")
                    .maternalSurname("García")
                    .studentCode("202414005")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 12, 8))
                    .cellphoneNumber("951365750")
                    .password("claveE0005")
                    .socioeconomicInformation(
                        new SocioeconomicInformation(
                            "CUSCO",
                            MaritalStatus.SOLTERO,
                            3,
                            "TECNICO",
                            "RESTAURANTE",
                            2,
                            1200.0,
                            "976543210",
                            "raulc77@gmail.com",
                            "AV. SOL 12",
                            4,
                            "PADRE",
                            HousingType.CUARTO
                        )
                    )
                    .personalProblems(new PersonalProblems(PersonalProblemType.D, null, "JUAN HERNÁNDEZ RAMOS"))
                    .familyGroupInformation(
                        new FamilyGroupInformation(
                            "SECUNDARIA",
                            "UNIVERSITARIO",
                            "DOCENTE",
                            "DOCENTE",
                            FamilyComposition.EXTENSA,
                            5,
                            3,
                            FamilyType.INCOMPLETA,
                            "976543210"
                        )
                    )
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Ana")
                    .paternalSurname("Hernández")
                    .maternalSurname("Hernández")
                    .studentCode("202414006")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 8, 19))
                    .cellphoneNumber("935663597")
                    .password("claveE0006")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Luis")
                    .paternalSurname("Vargas")
                    .maternalSurname("Mendoza")
                    .studentCode("202414007")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 9, 8))
                    .cellphoneNumber("909404339")
                    .password("claveE0007")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Luis")
                    .paternalSurname("López")
                    .maternalSurname("Ramírez")
                    .studentCode("202414008")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 5, 26))
                    .cellphoneNumber("905460927")
                    .password("claveE0008")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Gabriela")
                    .paternalSurname("García")
                    .maternalSurname("Ramírez")
                    .studentCode("202414009")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 4, 15))
                    .cellphoneNumber("990153067")
                    .password("claveE0009")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Gabriela")
                    .paternalSurname("Vargas")
                    .maternalSurname("Vargas")
                    .studentCode("202414010")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 2, 16))
                    .cellphoneNumber("966414150")
                    .password("claveE0010")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());
            studentService.create(Student.builder()
                    .name("Luis Luis")
                    .paternalSurname("Martínez")
                    .maternalSurname("Torres")
                    .studentCode("202414011")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 7, 25))
                    .cellphoneNumber("949010211")
                    .password("claveE0011")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Carlos")
                    .paternalSurname("López")
                    .maternalSurname("Sánchez")
                    .studentCode("202414012")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 4, 14))
                    .cellphoneNumber("910259526")
                    .password("claveE0012")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Ana")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Torres")
                    .studentCode("202414013")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 3, 10))
                    .cellphoneNumber("922215356")
                    .password("claveE0013")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Raúl")
                    .paternalSurname("Vargas")
                    .maternalSurname("García")
                    .studentCode("202414014")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 11, 1))
                    .cellphoneNumber("944022052")
                    .password("claveE0014")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Juliana")
                    .paternalSurname("García")
                    .maternalSurname("Martínez")
                    .studentCode("202414015")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 12, 28))
                    .cellphoneNumber("931804211")
                    .password("claveE0015")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Luis")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Vargas")
                    .studentCode("202414016")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 2, 25))
                    .cellphoneNumber("975975085")
                    .password("claveE0016")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Luis")
                    .paternalSurname("Martínez")
                    .maternalSurname("Mendoza")
                    .studentCode("202414017")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 11, 21))
                    .cellphoneNumber("924883625")
                    .password("claveE0017")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Raúl")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Ramírez")
                    .studentCode("202414018")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 2, 19))
                    .cellphoneNumber("942498424")
                    .password("claveE0018")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Carlos")
                    .paternalSurname("López")
                    .maternalSurname("Ramírez")
                    .studentCode("202414019")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 8, 6))
                    .cellphoneNumber("963226287")
                    .password("claveE0019")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Luis")
                    .paternalSurname("Vargas")
                    .maternalSurname("Mendoza")
                    .studentCode("202414020")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 6, 14))
                    .cellphoneNumber("998863652")
                    .password("claveE0020")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Carlos")
                    .paternalSurname("López")
                    .maternalSurname("Hernández")
                    .studentCode("202414021")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 11, 16))
                    .cellphoneNumber("954568208")
                    .password("claveE0021")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Luis María")
                    .paternalSurname("López")
                    .maternalSurname("Pérez")
                    .studentCode("202414022")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 11, 20))
                    .cellphoneNumber("971746935")
                    .password("claveE0022")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Juan")
                    .paternalSurname("Torres")
                    .maternalSurname("López")
                    .studentCode("202414023")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 2, 7))
                    .cellphoneNumber("955582739")
                    .password("claveE0023")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Carlos")
                    .paternalSurname("Vargas")
                    .maternalSurname("Pérez")
                    .studentCode("202414024")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 5, 18))
                    .cellphoneNumber("954000642")
                    .password("claveE0024")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juliana")
                    .paternalSurname("Martínez")
                    .maternalSurname("Pérez")
                    .studentCode("202414025")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 6, 18))
                    .cellphoneNumber("939759672")
                    .password("claveE0025")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Claudia")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Hernández")
                    .studentCode("202414026")
                    .yearOfStudy(1)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2006, 12, 17))
                    .cellphoneNumber("999088315")
                    .password("claveE0026")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Luis")
                    .paternalSurname("Hernández")
                    .maternalSurname("Ramírez")
                    .studentCode("202414027")
                    .yearOfStudy(1)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2006, 6, 23))
                    .cellphoneNumber("985488545")
                    .password("claveE0027")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Juliana")
                    .paternalSurname("Martínez")
                    .maternalSurname("García")
                    .studentCode("202314001")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 8, 9))
                    .cellphoneNumber("982653711")
                    .password("claveE0001")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Raúl")
                    .paternalSurname("Torres")
                    .maternalSurname("Martínez")
                    .studentCode("202314002")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 6, 14))
                    .cellphoneNumber("982488606")
                    .password("claveE0002")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Ana")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Mendoza")
                    .studentCode("202314003")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 5, 23))
                    .cellphoneNumber("976496803")
                    .password("claveE0003")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Raúl")
                    .paternalSurname("Hernández")
                    .maternalSurname("Torres")
                    .studentCode("202314004")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 8, 6))
                    .cellphoneNumber("973212251")
                    .password("claveE0004")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Carlos")
                    .paternalSurname("Pérez")
                    .maternalSurname("Torres")
                    .studentCode("202314005")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 9, 26))
                    .cellphoneNumber("988070102")
                    .password("claveE0005")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Ana")
                    .paternalSurname("Ramírez")
                    .maternalSurname("López")
                    .studentCode("202314006")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 7, 16))
                    .cellphoneNumber("930446764")
                    .password("claveE0006")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Claudia")
                    .paternalSurname("Sánchez")
                    .maternalSurname("López")
                    .studentCode("202314007")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 9, 27))
                    .cellphoneNumber("949138870")
                    .password("claveE0007")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Juan")
                    .paternalSurname("García")
                    .maternalSurname("Torres")
                    .studentCode("202314008")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 10, 27))
                    .cellphoneNumber("913707049")
                    .password("claveE0008")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Carlos")
                    .paternalSurname("Torres")
                    .maternalSurname("López")
                    .studentCode("202314009")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 2, 8))
                    .cellphoneNumber("913039253")
                    .password("claveE0009")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Ana")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Martínez")
                    .studentCode("202314010")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 10, 11))
                    .cellphoneNumber("973812817")
                    .password("claveE0010")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Gabriela")
                    .paternalSurname("Torres")
                    .maternalSurname("Sánchez")
                    .studentCode("202314011")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 7, 16))
                    .cellphoneNumber("963223691")
                    .password("claveE0011")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Luis Juan")
                    .paternalSurname("López")
                    .maternalSurname("Torres")
                    .studentCode("202314012")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 9, 18))
                    .cellphoneNumber("971985915")
                    .password("claveE0012")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Ana")
                    .paternalSurname("Mendoza")
                    .maternalSurname("García")
                    .studentCode("202314013")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 1, 20))
                    .cellphoneNumber("998875886")
                    .password("claveE0013")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Carlos")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Mendoza")
                    .studentCode("202314014")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 2, 23))
                    .cellphoneNumber("997901055")
                    .password("claveE0014")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Ana")
                    .paternalSurname("Vargas")
                    .maternalSurname("Hernández")
                    .studentCode("202314015")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 3, 18))
                    .cellphoneNumber("963510651")
                    .password("claveE0015")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Carlos")
                    .paternalSurname("Pérez")
                    .maternalSurname("Torres")
                    .studentCode("202314016")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 6, 27))
                    .cellphoneNumber("934326244")
                    .password("claveE0016")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Gabriela")
                    .paternalSurname("López")
                    .maternalSurname("Mendoza")
                    .studentCode("202314017")
                    .yearOfStudy(2)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2005, 10, 22))
                    .cellphoneNumber("989041715")
                    .password("claveE0017")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María María")
                    .paternalSurname("Torres")
                    .maternalSurname("Martínez")
                    .studentCode("202314018")
                    .yearOfStudy(2)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2005, 3, 22))
                    .cellphoneNumber("977738403")
                    .password("claveE0018")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José José")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Pérez")
                    .studentCode("202214001")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 2, 4))
                    .cellphoneNumber("910951228")
                    .password("claveE0001")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos María")
                    .paternalSurname("Martínez")
                    .maternalSurname("Martínez")
                    .studentCode("202214002")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 3, 3))
                    .cellphoneNumber("950486263")
                    .password("claveE0002")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana José")
                    .paternalSurname("Pérez")
                    .maternalSurname("Hernández")
                    .studentCode("202214003")
                    .yearOfStudy(3)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2004, 6, 19))
                    .cellphoneNumber("908297711")
                    .password("claveE0003")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Luis Ana")
                    .paternalSurname("López")
                    .maternalSurname("Ramírez")
                    .studentCode("202214004")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 11, 22))
                    .cellphoneNumber("983258286")
                    .password("claveE0004")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Carlos")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Ramírez")
                    .studentCode("202214005")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 3, 17))
                    .cellphoneNumber("906601062")
                    .password("claveE0005")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Luis Claudia")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Pérez")
                    .studentCode("202214006")
                    .yearOfStudy(3)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2004, 1, 15))
                    .cellphoneNumber("909626559")
                    .password("claveE0006")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Ana")
                    .paternalSurname("Pérez")
                    .maternalSurname("Vargas")
                    .studentCode("202214007")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 8, 8))
                    .cellphoneNumber("965124087")
                    .password("claveE0007")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Ana")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Mendoza")
                    .studentCode("202214008")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 8, 1))
                    .cellphoneNumber("923862096")
                    .password("claveE0008")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Ana")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Hernández")
                    .studentCode("202214009")
                    .yearOfStudy(3)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2004, 7, 22))
                    .cellphoneNumber("911851111")
                    .password("claveE0009")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José María")
                    .paternalSurname("Vargas")
                    .maternalSurname("López")
                    .studentCode("202214010")
                    .yearOfStudy(3)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2004, 6, 21))
                    .cellphoneNumber("925487014")
                    .password("claveE0010")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juan")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Pérez")
                    .studentCode("202214011")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 1, 15))
                    .cellphoneNumber("926522959")
                    .password("claveE0011")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Claudia")
                    .paternalSurname("Torres")
                    .maternalSurname("Torres")
                    .studentCode("202214012")
                    .yearOfStudy(3)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2004, 1, 11))
                    .cellphoneNumber("960917575")
                    .password("claveE0012")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Luis")
                    .paternalSurname("Pérez")
                    .maternalSurname("Martínez")
                    .studentCode("202214013")
                    .yearOfStudy(3)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2004, 8, 14))
                    .cellphoneNumber("978986699")
                    .password("claveE0013")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Ana")
                    .paternalSurname("López")
                    .maternalSurname("Pérez")
                    .studentCode("202114001")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 3, 24))
                    .cellphoneNumber("990154047")
                    .password("claveE0001")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Raúl")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Pérez")
                    .studentCode("202114002")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 2, 20))
                    .cellphoneNumber("997750820")
                    .password("claveE0002")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juan")
                    .paternalSurname("Vargas")
                    .maternalSurname("Pérez")
                    .studentCode("202114003")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 1, 12))
                    .cellphoneNumber("929893963")
                    .password("claveE0003")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana María")
                    .paternalSurname("García")
                    .maternalSurname("Vargas")
                    .studentCode("202114004")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 9, 10))
                    .cellphoneNumber("915209130")
                    .password("claveE0004")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Carlos")
                    .paternalSurname("Sánchez")
                    .maternalSurname("Pérez")
                    .studentCode("202114005")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 1, 18))
                    .cellphoneNumber("910625342")
                    .password("claveE0005")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia José")
                    .paternalSurname("Hernández")
                    .maternalSurname("Vargas")
                    .studentCode("202114006")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 12, 2))
                    .cellphoneNumber("927122062")
                    .password("claveE0006")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Raúl Ana")
                    .paternalSurname("Torres")
                    .maternalSurname("García")
                    .studentCode("202114007")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 12, 17))
                    .cellphoneNumber("925660652")
                    .password("claveE0007")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María María")
                    .paternalSurname("Mendoza")
                    .maternalSurname("López")
                    .studentCode("202114008")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 6, 10))
                    .cellphoneNumber("967255244")
                    .password("claveE0008")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Claudia")
                    .paternalSurname("Torres")
                    .maternalSurname("Hernández")
                    .studentCode("202114009")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 10, 8))
                    .cellphoneNumber("956026298")
                    .password("claveE0009")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juliana")
                    .paternalSurname("Martínez")
                    .maternalSurname("Torres")
                    .studentCode("202114010")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 4, 13))
                    .cellphoneNumber("947668324")
                    .password("claveE0010")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Luis")
                    .paternalSurname("Mendoza")
                    .maternalSurname("Vargas")
                    .studentCode("202114011")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 3, 28))
                    .cellphoneNumber("928819647")
                    .password("claveE0011")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Raúl")
                    .paternalSurname("Vargas")
                    .maternalSurname("Torres")
                    .studentCode("202114012")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 11, 18))
                    .cellphoneNumber("997356863")
                    .password("claveE0012")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana José")
                    .paternalSurname("Vargas")
                    .maternalSurname("Ramírez")
                    .studentCode("202114013")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 9, 15))
                    .cellphoneNumber("924031260")
                    .password("claveE0013")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos José")
                    .paternalSurname("García")
                    .maternalSurname("Torres")
                    .studentCode("202114014")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 3, 23))
                    .cellphoneNumber("915940710")
                    .password("claveE0014")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Carlos")
                    .paternalSurname("Pérez")
                    .maternalSurname("Torres")
                    .studentCode("202114015")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 1, 16))
                    .cellphoneNumber("943362075")
                    .password("claveE0015")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Gabriela")
                    .paternalSurname("Pérez")
                    .maternalSurname("Mendoza")
                    .studentCode("202114016")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 3, 13))
                    .cellphoneNumber("938766802")
                    .password("claveE0016")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Raúl")
                    .paternalSurname("García")
                    .maternalSurname("Torres")
                    .studentCode("202114017")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 5, 9))
                    .cellphoneNumber("972211243")
                    .password("claveE0017")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Carlos")
                    .paternalSurname("Torres")
                    .maternalSurname("Ramírez")
                    .studentCode("202114018")
                    .yearOfStudy(4)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2003, 1, 27))
                    .cellphoneNumber("935565797")
                    .password("claveE0018")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Carlos")
                    .paternalSurname("López")
                    .maternalSurname("Torres")
                    .studentCode("202114019")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 6, 28))
                    .cellphoneNumber("954400966")
                    .password("claveE0019")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan José")
                    .paternalSurname("Martínez")
                    .maternalSurname("Mendoza")
                    .studentCode("202114020")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 3, 6))
                    .cellphoneNumber("900532726")
                    .password("claveE0020")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Raúl")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Mendoza")
                    .studentCode("202114021")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 9, 6))
                    .cellphoneNumber("917143455")
                    .password("claveE0021")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia María")
                    .paternalSurname("Vargas")
                    .maternalSurname("Ramírez")
                    .studentCode("202114022")
                    .yearOfStudy(4)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2003, 10, 7))
                    .cellphoneNumber("925281113")
                    .password("claveE0022")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juan Carlos")
                    .paternalSurname("García")
                    .maternalSurname("Hernández")
                    .studentCode("202014001")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 1, 12))
                    .cellphoneNumber("943530846")
                    .password("claveE0001")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Claudia")
                    .paternalSurname("Torres")
                    .maternalSurname("Mendoza")
                    .studentCode("202014002")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 7, 11))
                    .cellphoneNumber("935927524")
                    .password("claveE0002")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Ana")
                    .paternalSurname("López")
                    .maternalSurname("Sánchez")
                    .studentCode("202014003")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 4, 11))
                    .cellphoneNumber("922443989")
                    .password("claveE0003")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("María Carlos")
                    .paternalSurname("García")
                    .maternalSurname("Ramírez")
                    .studentCode("202014004")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 3, 28))
                    .cellphoneNumber("953975059")
                    .password("claveE0004")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Luis Juliana")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Torres")
                    .studentCode("202014005")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 8, 16))
                    .cellphoneNumber("990066444")
                    .password("claveE0005")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Ana Raúl")
                    .paternalSurname("García")
                    .maternalSurname("Martínez")
                    .studentCode("202014006")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 8, 21))
                    .cellphoneNumber("918691212")
                    .password("claveE0006")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juliana")
                    .paternalSurname("Martínez")
                    .maternalSurname("Vargas")
                    .studentCode("202014007")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 4, 14))
                    .cellphoneNumber("919340949")
                    .password("claveE0007")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Juan")
                    .paternalSurname("Martínez")
                    .maternalSurname("Vargas")
                    .studentCode("202014008")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 12, 23))
                    .cellphoneNumber("905896711")
                    .password("claveE0008")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Juliana")
                    .paternalSurname("Ramírez")
                    .maternalSurname("Mendoza")
                    .studentCode("202014009")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 8, 25))
                    .cellphoneNumber("907194615")
                    .password("claveE0009")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Claudia Juliana")
                    .paternalSurname("López")
                    .maternalSurname("Torres")
                    .studentCode("202014010")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 12, 8))
                    .cellphoneNumber("903401792")
                    .password("claveE0010")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Ana")
                    .paternalSurname("Torres")
                    .maternalSurname("Ramírez")
                    .studentCode("202014011")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 11, 9))
                    .cellphoneNumber("939735121")
                    .password("claveE0011")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Ana")
                    .paternalSurname("Martínez")
                    .maternalSurname("Hernández")
                    .studentCode("202014012")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 2, 21))
                    .cellphoneNumber("958510735")
                    .password("claveE0012")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Carlos")
                    .paternalSurname("Vargas")
                    .maternalSurname("Mendoza")
                    .studentCode("202014013")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 3, 19))
                    .cellphoneNumber("933834828")
                    .password("claveE0013")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela Juliana")
                    .paternalSurname("Pérez")
                    .maternalSurname("Pérez")
                    .studentCode("202014014")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 3, 27))
                    .cellphoneNumber("996158508")
                    .password("claveE0014")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Juan")
                    .paternalSurname("García")
                    .maternalSurname("García")
                    .studentCode("202014015")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 4, 11))
                    .cellphoneNumber("903900787")
                    .password("claveE0015")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José Carlos")
                    .paternalSurname("Vargas")
                    .maternalSurname("Pérez")
                    .studentCode("202014016")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 5, 26))
                    .cellphoneNumber("981171835")
                    .password("claveE0016")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Gabriela José")
                    .paternalSurname("López")
                    .maternalSurname("García")
                    .studentCode("202014017")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 8, 2))
                    .cellphoneNumber("915941971")
                    .password("claveE0017")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Carlos Carlos")
                    .paternalSurname("Pérez")
                    .maternalSurname("García")
                    .studentCode("202014018")
                    .yearOfStudy(5)
                    .genderCode('M')
                    .dateOfBirth(LocalDate.of(2002, 2, 5))
                    .cellphoneNumber("974115018")
                    .password("claveE0018")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("José María")
                    .paternalSurname("Ramírez")
                    .maternalSurname("García")
                    .studentCode("202014019")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 8, 2))
                    .cellphoneNumber("917973285")
                    .password("claveE0019")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

            studentService.create(Student.builder()
                    .name("Juliana Carlos")
                    .paternalSurname("Vargas")
                    .maternalSurname("López")
                    .studentCode("202014020")
                    .yearOfStudy(5)
                    .genderCode('F')
                    .dateOfBirth(LocalDate.of(2002, 7, 2))
                    .cellphoneNumber("944336731")
                    .password("claveE0020")
                    .socioeconomicInformation(null)
                    .personalProblems(null)
                    .familyGroupInformation(null)
                    .build());

        };
    }
}
