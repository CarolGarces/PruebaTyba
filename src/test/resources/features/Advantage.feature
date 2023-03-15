# language: es

  @Registro
  Característica: Verficación del registro en el portal AdvantageDemo
    Yo como usuario
    Quiero registrarme al portal
    para poder ingresar y realizar compras

    @RegistroExitoso
  Esquema del escenario: Verificar registro exitoso

    Dado que el usuario ingresa al portal AdvantageDemo
    Y requiere realizar un registro
    Cuando diligencia los campos obligatorios de registro
       | <NOMBRE_USUARIO> | <CORREO> | <CONTRASENA> |
    Entonces se debe registrar exitosamente <NOMBRE_USUARIO>

    Ejemplos:

      | NOMBRE_USUARIO | CORREO | CONTRASENA |
      | prueba9878| prueba988@gmail.com| Prueba987.13|

