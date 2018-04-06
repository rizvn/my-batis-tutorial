CREATE TABLE Customer
(
  ref VARCHAR(255),
  name VARCHAR(255),
  addressLine1 VARCHAR(255),
  town VARCHAR(255),
  county VARCHAR(255),
  postcode VARCHAR(255),
  active bool
);


INSERT INTO Customer (ref, name, addressLine1, town, county, postcode, active)
VALUES ('001', 'Riz', '1 Some Street', 'Some Town', 'Some County', 'AB1 4DE', TRUE );

INSERT INTO Customer (ref, name, addressLine1, town, county, postcode, active)
VALUES ('002', 'Bob',  '14 Another Street', 'Another Town', 'Some County', 'AB1 4EF', TRUE );

INSERT INTO Customer (ref, name,  addressLine1, town, county, postcode, active)
VALUES ('003', 'Dave', '19 Some Street', 'Some Town', 'Some County', 'AB1 4DE', TRUE );

INSERT INTO Customer (ref, name,  addressLine1, town, county, postcode, active)
VALUES ('004', 'Tom', '14 Some Street', 'Some Town', 'Some County', 'AB1 4DE', FALSE );