Feature: Query PostCode endpoint and verify the response

  @apitests
  Scenario: Postcode API validate the value for given keys
    Given the user queries postcode endpoint with CR92BY
    Then verify the below details in the response
      | status                  | 200                   |
      | result.ccg              | NHS South West London |
      | result.codes.admin_ward | E05011468             |

  @apitests
  Scenario Outline: User calls web service to get a response code
    Given the user queries postcode endpoint with <Postcode>
    Then the response status code should be <Status Code>
    And the schema should match with the specification defined in <Schema>

    Examples:
      | Postcode | Status Code | Schema                |
      | SW1P4JA  | 200         | postcode_valid.json   |
      | INVALID  | 404         | postcode_invalid.json |