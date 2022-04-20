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