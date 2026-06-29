CREATE INDEX product_id_index ON product_event (product_id);

CREATE INDEX componsite_id_type ON product_event(product_id, event_type);