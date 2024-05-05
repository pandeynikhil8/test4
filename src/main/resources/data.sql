

-- Insert into Transformation table
INSERT INTO Transformation (Transform_id, Description) VALUES ('1001', 'Addition Operation');

-- Insert into Transformation_Rule table
INSERT INTO Transformation_Rule (Transform_id, Rule_id, Sequence) VALUES ('1001', 'R_1', 1);

-- Insert into Rule table
INSERT INTO Rule (Rule_id, Version, Description, Class_Name, Method_Name, Major_Code, Minor_Code) VALUES ('R_1', 1, 'Addition Rule', 'com.example.math.MathOperationClass', 'operation', '1000', '1');

-- Insert into Rule_Parameter table
INSERT INTO Rule_Parameter (Parameter_ID, Parameter_Value, Description, external_parameter) VALUES ('P_1', '2', 'First operand', FALSE);
INSERT INTO Rule_Parameter (Parameter_ID, Parameter_Value, Description, external_parameter) VALUES ('P_2', '3', 'Second operand', FALSE);

-- Insert into Rule_RuleParameter_Mapping table
-- INSERT INTO Rule_RuleParameter_Mapping (Rule_id, Parameter_ID) VALUES ('R_1', 'P_1');
-- INSERT INTO Rule_RuleParameter_Mapping (Rule_id, Parameter_ID) VALUES ('R_1', 'P_2');

-- Insert into Error table (assuming no error for addition operation)
INSERT INTO Error (Major_Code, Minor_Code, Error_Message) VALUES ('1000', '1', 'Error In Addition');
