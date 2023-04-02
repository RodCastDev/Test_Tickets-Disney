Feature: Automatizacion DestinoJet
  Yo como aspirante a automatizador QA Smart Talent
  Requiero ingresar a la pagina Destino Jet para
  Realizar pruebas de atuomatizado sobre elemento Tickets

  Scenario: Producto Tickets Disney
    Given Deseo ir a la pagina DestinoJet
    And Selecciono la opcion "Tickets Disney"
    And Busco la disponivilidad del viaje con los datos
      |   fecha  |dias|adultos|ninos|
      |2023-04-25| 5  |   3   |  2  |
    Then Valido la solicitud de viaje "RESUMEN DE SELECCIÓN"

