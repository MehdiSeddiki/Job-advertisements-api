INSERT INTO client('id', 'name') VALUES(1, 'VEOLIA');
INSERT INTO client('id', 'name') VALUES(2, 'Wesquad');

INSERT INTO missions('id', 'location', 'duration', 'price' , 'remote', 'beginning', 'job', 'context', 'description', 'client_id')
VALUES(1, 'Issy-les-Moulineaux', 12, null, 0.8, '2021-05-12', 'Développeur ReactJs', 'intégration au sein de l’équipe Engineering du pôle Industrialisation, Cloud and Data, le consultant contribuera aux activités APIs et API Management.', 'Participer aux Comités d’Architecture pour garantir la bonne conformité des bonnes pratiques des APIs. Promouvoir les pratiques API First au sein du groupe. Rédiger / Maintenir un Guideline de développement d’API (créationde modèle d’API, ...)', 1);

INSERT INTO missions('id', 'location', 'duration', 'price' , 'remote', 'beginning', 'job', 'context', 'description', 'client_id')
VALUES(1, 'Le Kremlin-Bicêtre', 6, null, 0.5, '2021-07-02', 'Stagiaire développeur Java', 'Dans la démarche de refonte de leur SI, EPITA a besoin d''une nouvelle application', 'Création d''une application permettant de recenser des missions d''une entreprise, tout en utilisant les bonnes pratiques (Clean code, architecture, tests, CI ....). Création d''une API Rest', 2);



