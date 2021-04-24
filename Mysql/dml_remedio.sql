SELECT * FROM db_farmacia.tb_categoria;

INSERT INTO db_farmacia.tb_categoria(categoria,generico)
VALUES
('Medicamentos', 'Tiranol'),
('Suplementos', 'Whey Protein'),
('Vitamina', 'Prosense'),
('Produtos de Higieni', 'Cotonete'),
('Cosmeticos', 'Batom');

INSERT INTO db_farmacia.tb_produto(produto, preco, pagamento, validade, tb_categoria_id_categoria)
VALUES

('Novalgina', '24', 'dinheiro', '7', '1'),
('Dorflex', '28', 'cartao', '2', '2'),
('Buscopan', '32', 'dinheiro', '4', '3'),
('Paracetamol', '23', 'cartao', '9', '4'),
('Doril', '26', 'dinhero', '6', '5');

SELECT * FROM tb_produto
WHERE preco > 50

SELECT * FROM tb_produto 
WHERE preco BETWEEN 20 AND 30

SELECT * FROM tb_produto
WHERE produto LIKE "b%"



SELECT * FROM db_farmacia.tb_categoria
INNER JOIN db_farmacia.tb_produto
ON tb_categoria.id_categoria = tb_produto.tb_categoria_id_categoria
WHERE tb_categoria.generico LIKE "Tiranol";

