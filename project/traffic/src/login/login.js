import React, { useEffect, useState, useRef } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import { Container } from 'react-bootstrap';
import style from './login.module.css';
import ScrollDown from '../components/ScrollDown/ScrollDown';

function Login() {
    const navigate = useNavigate();

    const [id, setId] = useState('');
    const [password, setPassword] = useState('');
    const [isActive, setIsActive] = useState(false); // 버튼 상태 관리

    // input창 foucs
    const inputId = useRef(null);
    const inputPw = useRef(null);


    // login 버튼 클릭 시
    const handleLogin = (e) => {
        e.preventDefault(); // 기본 동작 방지
        axios.post('http://localhost:8080/api/login', { id, password })
            .then(response => {
                console.log('Login successful:', response.data);
            })
            .catch(error => {
                console.error('Login failed:', error);
            });
    };

    // submit 버튼 클릭 시, active 이벤트
    const handleMouseDown = (e) => {
        e.preventDefault(); // 폼 제출 방지
        setIsActive(true); // 버튼 클릭 시 active 상태로 전환
    };

    const handleMouseUp = () => {
        setIsActive(false); // 버튼 클릭 해제 시 active 상태 해제
    };

    // 빈칸 유효성 검사
    const handleFormSubmit = (e) => {
        e.preventDefault();
    
        if (!id) {
            alert("아이디를 입력해주세요");
            return inputId.current.focus();
        }
    
        if (!password) {
            alert("비밀번호를 입력해주세요");
            return inputPw.current.focus();
        }
    
        handleLogin(e); // 유효성 검사를 통과하면 로그인 요청 실행
    };

    // 구글 로그인
    const doGoogleLogin = () => {
        const clientId = process.env.REACT_APP_GOOGLE_CLIENT_ID;
        const redirectUri = process.env.REACT_APP_GOOGLE_REDIRECT_URL;

        if (!clientId || !redirectUri) {
            alert('Google 로그인 환경 변수가 설정되지 않았습니다.');
            return;
        }

        const url = `https://accounts.google.com/o/oauth2/v2/auth?client_id=${clientId}&redirect_uri=${redirectUri}&response_type=code&scope=email profile`;
        window.location.href = url;
    };

    return (
        <div className='container'>
            <Container>
                <form className={`text-center ${style.formSection}`} onSubmit={handleFormSubmit}>
                    <h2 className={style.pageTitle}>Login</h2>
                    <div className={`mb-3 ${style.formbox1}`}>
                        <label htmlFor="id" className={`form-label ${style.formLabel1}`}>ID</label>
                        <input id="id" type="text" 
                               className={style.formCtrlId} 
                               value={id} 
                               ref={inputId}
                               onChange={(e) => setId(e.target.value)} />
                    </div>
                    <div className={`mb-3 ${style.formbox2}`}>
                        <label htmlFor="password" className={`form-label ${style.formLabel2}`}>Password</label>
                        <input id="password" type="password" 
                               className={style.formCtrlPw} value={password} 
                               ref={inputPw} 
                               onChange={(e) => setPassword(e.target.value)}/>
                    </div>
                    <button
                        type="submit"
                        id="submitBtn"
                        className={`${style.formSumbitBtn} ${isActive ? style.active : ''}`}
                        onMouseDown={handleMouseDown}
                        onMouseUp={handleMouseUp}
                    >Login</button>

                    <div className={style.formbox3}>
                        <div className={style.pwFindbox}>
                            <a className={style.pwFindTag}>Find Password➡️</a>
                        </div>
                    </div>
                    <hr className='hrTag' />
                    <div className={`mb-3 ${style.formbox4}`}>
                        <a className={style.googleTag} onClick={doGoogleLogin}>구글</a>
                        <a className={style.naverTag} href=''>네이버</a>
                    </div>
                </form>
                <ScrollDown onClick={() => navigate('/register')} />
            </Container>
        </div>
    );
}

export default Login;