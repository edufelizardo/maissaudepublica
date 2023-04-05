--# Funcionario - Seus dados pessoais
INSERT INTO endereco (cep, logradouro, numero, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi, familia_id, area_id)
VALUES
  ('01001-000', 'Praça da Sé', 1, '', 'Sé', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01002-000', 'Praça Clóvis Beviláqua', 1, '', 'Sé', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01003-000', 'Viaduto Santa Ifigênia', 1, '', 'Santa Ifigênia', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01004-000', 'Rua Florêncio de Abreu', 1, '', 'Centro', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01005-000', 'Viaduto do Chá', 15, '', 'Centro', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01006-000', 'Rua Boa Vista', 1, '', 'Centro', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01007-000', 'Praça da República', 1, '', 'República', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01008-000', 'Avenida Ipiranga', 165, '', 'República', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01009-000', 'Rua da Consolação', 358, '', 'Consolação', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null),
  ('01010-000', 'Rua Xavier de Toledo', 1, '', 'Centro', 'São Paulo', 'SP', '3550308', '1004', '11', '7107', null, null);

INSERT INTO pessoa (nome_completo, data_de_nascimento, cpf, email, endereco_id)
VALUES
    ('João Silva', '1985-05-20', '123.456.789-00', 'joao.silva@test.com', null);
    ('Maria Santos', '1990-02-15', '987.654.321-00', 'maria.santos@test.com', null),
    ('Pedro Almeida', '1978-12-10', '456.789.123-00', 'pedro.almeida@test.com', null),
    ('Carla Souza', '1987-06-30', '789.123.456-00', 'carla.souza@test.com', null),
    ('Lucas Mendes', '1995-03-25', '654.321.987-00', 'lucas.mendes@test.com', null),
    ('Juliana Oliveira', '1980-08-12', '321.789.456-00', 'juliana.oliveira@test.com', null),
    ('Marcelo Santos', '1983-11-05', '987.654.321-00', 'marcelo.santos@test.com', null),
    ('Camila Silva', '1992-09-22', '456.789.123-00', 'camila.silva@test.com', null),
    ('Fernando Alves', '1975-04-18', '789.123.456-00', 'fernando.alves@test.com', null),
    ('Mariana Costa', '1988-07-01', '654.321.987-00', 'mariana.costa@test.com', null);

INSERT INTO telefones (pessoa_id, telefones)
VALUES
    (1, '011 96060-7070'),
    (1, '011 96060-7071'),
    (2, '011 96060-7072'),
    (2, '011 96060-7073'),
    (3, '011 96060-7074'),
    (3, '011 96060-7075'),
    (4, '011 96060-7076'),
    (4, '011 96060-7077'),
    (5, '011 96060-7078'),
    (5, '011 96060-7079'),
    (6, '011 96060-7080'),
    (6, '011 96060-7081'),
    (7, '011 96060-7082'),
    (7, '011 96060-7083'),
    (8, '011 96060-7084'),
    (8, '011 96060-7085'),
    (9, '011 96060-7086'),
    (9, '011 96060-7087'),
    (10, '011 96060-7088'),
    (10, '011 96060-7089');

----# Registros primários
--INSERT INTO escala_trabalho (inicio_do_expediente, horario_almoco, fim_do_expediente, nome_do_expediente)
--VALUES ('07:00:00', '1:00:00', '16:00:00', 'Matutino 1'),
--       ('8:00:00', '1:00:00', '17:00:00', 'Matutino 2'),
--       ('10:00:00', '1:00:00', '19:00:00', 'Vespertino 1');
--
--INSERT INTO formacao (nome_formacao)
--VALUES
--    ('Medicina'),
--    ('Enfermagem'),
--    ('Técnico de Enfermagem'),
--    ( 'Fisioterapia'),
--    ('Odontologia'),
--    ('Farmácia'),
--    ('Nutrição'),
--    ('Psicologia'),
--    ('Terapia Ocupacional'),
--    ('Fonoaudiologia'),
--    ('Assistência Social'),
--    ('Educação Física'),
--    ('Fisioterapia'),
--    ('Terapia Holística'),
--    ('Acupuntura'),
--    ('Quiropraxia'),
--    ('Naturologia'),
--    ('Radiologia'),
--    ('Enfermagem do Trabalho'),
--    ('Psiquiatria');
--
--INSERT INTO departamento (nome_do_departamento)
--VALUES
--    ('Administração'),
--    ('Atendimento Médico'),
--    ('Enfermagem'),
--    ('Farmácia'),
--    ('Almoxarifado'),
--    ('Limpeza e Manutenção'),
--    ('Serviço Social'),
--    ('Psicologia'),
--    ('Nutrição'),
--    ('Fisioterapia'),
--    ('Terapia Ocupacional'),
--    ('Fonoaudiologia'),
--    ('Recepção'),
--    ('Coleta de Exames'),
--    ('Triagem'),
--    ('Odontologia'),
--    ('Vacinação'),
--    ('Educação em Saúde'),
--    ('Atendimento a Gestantes'),
--    ('Programa Saúde da Família');
--
--INSERT INTO funcao (nome_funcao)
--VALUES
--    ('Médico(a)'),
--    ('Enfermeiro(a)'),
--    ('Técnico(a) de Enfermagem'),
--    ('Assistente Social'),
--    ('Psicólogo(a)'),
--    ('Nutricionista'),
--    ('Fisioterapeuta'),
--    ('Terapeuta Ocupacional'),
--    ('Fonoaudiólogo(a)'),
--    ('Auxiliar Administrativo'),
--    ('Assistente Administrativo'),
--    ('Recepcionista'),
--    ('Motorista'),
--    ('Auxiliar de Limpeza'),
--    ('Segurança'),
--    ('Dentista');

-- Gerando dados aleatórios para inserção
--SELECT @fn := FLOOR(RAND() * 3) + 1; -- função aleatória de 1 a 3
--SELECT @dep := FLOOR(RAND() * 5) + 1; -- departamento aleatório de 1 a 5
--SELECT @esc := FLOOR(RAND() * 3) + 1; -- escala aleatória de 1 a 3

--INSERT INTO funcionario (data_de_admissao, data_de_demissao, registro_profissional, salario, pessoa_id,
--escala_trabalho_id, formacao_id, depart_id, funcao_id, funcionario_area_id, exame_resposavel_id, consulta_funcionario_id)
--VALUES
--    ('2018-05-12', null, 'CRM 12345', 12000.00, 1, 1, 1, 2, 1, null, null, null),
--    ('2019-02-20', null, 'COREN 54321', 8000.00, 2, 1, 2, 3, 2, null, null, null),
--    ('2020-01-10', null, 'COREN 98765', 5000.00, 3, 2, 3, 3, 2, null, null, null),
--    ('2021-08-05', null, 'CRO 123456', 15000.00, 4, 1, 1, 16, 16, null, null, null),
--    ('2017-11-29', null, 'CRP 654321', 9000.00, 5, 2, 2, 8, 8, null, null, null),
--    ('2018-12-01', null, 'COREN 98765', 5000.00, 6, 3, 3, 3, 2, null, null, null),
--    ('2019-06-30', null, 'CRO 123456', 15000.00, 7, 3, 1, 16, 16, null, null, null),
--    ('2020-07-15', null, 'CRP 654321', 9000.00, 8, 3, 2, 8, 8, null, null, null),
--    ('2017-09-22', null, 'COREN 54321', 8000.00, 9, 2, 3, 3, 2, null, null, null),
--    ('2018-11-10', null, 'CRM 12345', 12000.00, 10, 3, 1, 2, 1, null, null, null);

--# Registro secundarios
--INSERT INTO programa_de_saude (programa_de_saude_id, nome_programa_desaude, pro_de_saude_id)
--VALUES
--(null, 'Saúde da Mulher', 2),
--(null, 'Saúde do Idoso', 2),
--(null, 'Saúde do Homem', 2),
--(null, 'Saúde da Criança', 2),
--(null, 'Saúde Mental', 3),
--(null, 'Atenção Básica', 3),
--(null, 'Pré-Natal', 3),
--(null, 'Atendimento Emergencial', 3),
--(null, 'Controle da Tuberculose', 6),
--(null, 'Controle da Hanseníase', 6),
--(null, 'Atendimento a Doenças Respiratórias', 6),
--(null, 'Atendimento a Doenças Cardiovasculares', 6),
--(null, 'Vacinação', 2),
--(null, 'Odontologia', 2),
--(null, 'Controle de Endemias', 2),
--(null, 'Programa DST/AIDS', 2),
--(null, 'Alimentação e Nutrição', 3),
--(null, 'Saúde da População Negra', 3),
--(null, 'Saúde da População Indígena', 3),
--(null, 'Saúde da População LGBT', 3),
--(null, 'Saúde da População em Situação de Rua', 6),
--(null, 'Prevenção e Controle do Câncer', 6),
--(null, 'Atendimento a Pessoas com Deficiência', 6),
--(null, 'Atendimento a Dependentes Químicos', 6,
--(null, 'Atendimento a Pessoas com HIV/AIDS', 6),
--(null, 'Saúde do Trabalhador', 9),
--(null, 'Saúde do Viajante', 9),
--(null, 'Saúde da População Carcerária', 9),
--(null, 'Programa de Controle de Zoonoses', 9),
--(null, 'Prevenção e Combate a Doenças Infectocontagiosas', 9),
--(null, 'Saúde Bucal', 9),
--(null, 'Prevenção de Doenças Cardiovasculares', 9),
--(null, 'Prevenção e Tratamento do Câncer', 9),
--(null, 'Prevenção de Acidentes e Doenças Relacionadas ao Trabalho', 9);;
