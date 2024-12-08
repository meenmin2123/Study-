import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Container } from 'react-bootstrap';
import style from './login.module.css';

function Login() { // 컴포넌트 이름 대문자로 변경
    const [userInfo, setUserInfo] = useState('');

    useEffect(() => {
        // Spring Boot API 호출
        axios.get('http://localhost:8080/api/greet')
            .then(response => {
                setUserInfo(response.data); // 응답 메시지 설정
            })
            .catch(error => {
                console.error('There was an error!', error);
            });
    }, []);

    return (
        <div>
            <Container>
                <h2 className={style.pageTitle}>Login Page</h2>
                <form className={`text-center ${style.formSection}`}>
                    <div className={`mb-3 ${style.formbox1}`}>
                        <label htmlFor="id" className={`form-label ${style.formLabel1}`}>ID</label>
                        <input id="id" type="text" className={`form-control ${style.formCtrlId}`} />
                    </div>
                    <div className={`mb-3 ${style.formbox2}`}>
                        <label htmlFor="password" className={`form-label ${style.formLabel2}`}>Password</label>
                        <input id="password" type="password" className={`form-control ${style.formCtrlPw}`} />
                    </div>
                    <button type="submit" className="btn btn-primary">Login</button>
                </form>
            </Container>
        </div>
    );
}

export default Login;