Feature: Se realizan pruebas de consumo sobre pokeapi

  @exitoso
  Scenario: Consultar exitosamente un pokemon
    Given se prepara el request a PokeApi
    And se consulta un pokemon exitosamente
    When se recibe un response con codigo 200
    Then debe coincidir el nombre con el pokemon solicitado