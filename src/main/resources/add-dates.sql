ALTER TABLE CLIENT
    ADD COLUMN erstellen TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ADD COLUMN aktualisiert TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP