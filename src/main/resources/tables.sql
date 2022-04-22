CREATE TABLE IF NOT EXISTS quiz (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
user_id BIGINT,
title VARCHAR(200) NOT NULL,
    comment VARCHAR(400),
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE SET NULL
    );


CREATE TABLE IF NOT EXISTS questions (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
quiz_id BIGINT,
body VARCHAR(500) NOT NULL,
    FOREIGN KEY (quiz_id)
    REFERENCES quiz(id)
    ON DELETE CASCADE
    );


CREATE TABLE IF NOT EXISTS answers (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
questions_id BIGINT,
text VARCHAR(500) NOT NULL,
    raiting INT,
    single_answer BOOLEAN NOT NULL,
    question_order INT,
    FOREIGN KEY (questions_id)
    REFERENCES questions(id)
    ON DELETE CASCADE
    );

INSERT INTO springbootone.quiz (user_id, title, comment)
VALUES (1, 'First quiz', null)

INSERT INTO springbootone.questions (quiz_id, body)
VALUES (1, 'First question')