
    Feature: the user applies the job offer
  @scenario1
   Scenario Outline: the user wants to apply a job offer in choucair
    Given the user enters the portal choucair
    When the user applies a job offer
      |keywords|locations|nombre|correo|celular|estudios|experiencia|automatizacion|salarial|disponibilidad|mensaje|
      |<keywords>|<locations>|<nombre>|<correo>|<celular>|<estudios>|<experiencia>|<automatizacion>|<salarial>|<disponibilidad>|<mensaje>|
    Then successful registration verification
     |verificacion|
    |<verificacion>|

    Examples:
      |keywords|locations|nombre|correo|celular|estudios|experiencia|automatizacion|salarial|disponibilidad|mensaje|verificacion|
      |Analista de Pruebas|Medellín y Bogota|Deisy Tipazoca|deisy.tipazoca15@gmail.com|3143175760|Ingeniería de Software sexto semestre|2 años|Si conozco un poco|2500000|1 semana|no aplica|Analista de Pruebas Medellín y Bogotá|

